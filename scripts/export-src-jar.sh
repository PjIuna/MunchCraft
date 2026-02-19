#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
VERSION="$(sed -n 's:.*<version>\(.*\)</version>.*:\1:p' "$ROOT_DIR/pom.xml" | head -n1)"
OUT_DIR="$ROOT_DIR/release"
OUT_JAR="$OUT_DIR/munchcraft-src-${VERSION}.jar"

mkdir -p "$OUT_DIR"
rm -f "$OUT_JAR"

jar --create --file "$OUT_JAR" \
  -C "$ROOT_DIR" pom.xml \
  -C "$ROOT_DIR" src

echo "Created: $OUT_JAR"
