package defpackage;
/* compiled from: PG */
/* renamed from: kar  reason: default package */
/* loaded from: classes3.dex */
public class kar implements kao {
    private static final kap a = new kap(atyy.PLAYBACK_INTERRUPTION_TYPE_PLAYER_EXCEPTION);
    private final atyx b;

    public kar(atyx atyxVar) {
        this.b = atyxVar;
    }

    @Override // defpackage.kao
    public atyu a() {
        atyu a2 = a.a();
        atyx atyxVar = this.b;
        a2.copyOnWrite();
        ((atyv) a2.instance).j(atyxVar);
        return a2;
    }
}
