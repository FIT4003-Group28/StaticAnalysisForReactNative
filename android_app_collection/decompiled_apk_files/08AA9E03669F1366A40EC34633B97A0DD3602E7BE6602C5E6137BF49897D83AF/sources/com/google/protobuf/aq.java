package com.google.protobuf;
/* compiled from: TextFormatEscaper.java */
/* loaded from: classes.dex */
final class aq {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextFormatEscaper.java */
    /* loaded from: classes.dex */
    public interface a {
        byte a(int i);

        int a();
    }

    static String a(a aVar) {
        StringBuilder sb = new StringBuilder(aVar.a());
        for (int i = 0; i < aVar.a(); i++) {
            byte a2 = aVar.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(final f fVar) {
        return a(new a() { // from class: com.google.protobuf.aq.1
            @Override // com.google.protobuf.aq.a
            public int a() {
                return f.this.b();
            }

            @Override // com.google.protobuf.aq.a
            public byte a(int i) {
                return f.this.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(final byte[] bArr) {
        return a(new a() { // from class: com.google.protobuf.aq.2
            @Override // com.google.protobuf.aq.a
            public int a() {
                return bArr.length;
            }

            @Override // com.google.protobuf.aq.a
            public byte a(int i) {
                return bArr[i];
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return a(f.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
