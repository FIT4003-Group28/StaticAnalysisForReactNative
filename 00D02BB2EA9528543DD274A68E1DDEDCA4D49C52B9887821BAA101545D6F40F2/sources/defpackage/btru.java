package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btru  reason: default package */
/* loaded from: classes4.dex */
public final class btru implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ btrs b;
    private final String c;

    public btru(Object obj, btrs btrsVar) {
        this.a = obj;
        this.b = btrsVar;
        StringBuilder sb = new StringBuilder(128);
        sb.append("{event:{");
        sb.append(obj);
        sb.append("},handler:{");
        sb.append(btrsVar);
        sb.append("}}");
        this.c = sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        btrq.j(this.a, this.b);
    }

    public final String toString() {
        return this.c;
    }
}
