package defpackage;
/* compiled from: PG */
/* renamed from: clby  reason: default package */
/* loaded from: classes5.dex */
public final class clby {
    final /* synthetic */ clcb a;

    public clby(clcb clcbVar) {
        this.a = clcbVar;
    }

    public final void a(Iterable<Integer> iterable) {
        StringBuilder sb = new StringBuilder("[");
        for (Integer num : iterable) {
            sb.append(num);
            sb.append(", ");
        }
        sb.append("]");
        this.a.f();
        sb.toString();
        this.a.g.size();
    }
}
