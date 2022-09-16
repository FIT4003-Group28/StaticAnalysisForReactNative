package defpackage;
/* compiled from: PG */
/* renamed from: ssz  reason: default package */
/* loaded from: classes4.dex */
public final class ssz {
    public final /* synthetic */ String a;
    public final /* synthetic */ aysm b;

    public ssz(String str, aysm aysmVar) {
        this.a = str;
        this.b = aysmVar;
    }

    public final void a(String str, int i) {
        if (this.b.e()) {
            return;
        }
        aysm aysmVar = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 52);
        sb.append("Progress failed on ID: ");
        sb.append(str);
        sb.append(" with error code: ");
        sb.append(i);
        aysmVar.c(new Throwable(sb.toString()));
    }
}
