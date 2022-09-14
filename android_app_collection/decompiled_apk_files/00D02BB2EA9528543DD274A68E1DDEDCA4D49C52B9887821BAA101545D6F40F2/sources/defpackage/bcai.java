package defpackage;
/* compiled from: PG */
/* renamed from: bcai  reason: default package */
/* loaded from: classes3.dex */
final class bcai extends bcam {
    public final String a;
    private final String b;

    public bcai(String str, @dzsi String str2) {
        if (str != null) {
            this.b = str;
            this.a = str2;
            return;
        }
        throw new NullPointerException("Null localPhotoId");
    }

    @Override // defpackage.bcam
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bcam
    @dzsi
    public final String b() {
        return this.a;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 43 + String.valueOf(str2).length());
        sb.append("PhotoSelectionKey{localPhotoId=");
        sb.append(str);
        sb.append(", filePath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
