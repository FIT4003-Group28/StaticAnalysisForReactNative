package defpackage;
/* compiled from: PG */
/* renamed from: cpmv  reason: default package */
/* loaded from: classes5.dex */
public final class cpmv extends cpnb {
    public String a;
    public String b;
    public String c;

    @Override // defpackage.cpnb
    public final void a(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null suggestionDetail");
    }

    @Override // defpackage.cpnb
    public final void b(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null suggestionSelected");
    }
}
