package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azpo  reason: default package */
/* loaded from: classes3.dex */
public final class azpo implements Comparable<azpo> {
    public final dspd a;
    private final long b;

    public azpo(azyh azyhVar, dspd dspdVar) {
        this.b = azyhVar.j().c;
        this.a = dspdVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(azpo azpoVar) {
        return (this.b > azpoVar.b ? 1 : (this.b == azpoVar.b ? 0 : -1));
    }
}
