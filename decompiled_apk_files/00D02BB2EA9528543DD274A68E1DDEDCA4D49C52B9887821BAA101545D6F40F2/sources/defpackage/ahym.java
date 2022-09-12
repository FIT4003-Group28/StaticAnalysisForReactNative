package defpackage;
/* compiled from: PG */
/* renamed from: ahym  reason: default package */
/* loaded from: classes.dex */
public final class ahym implements dbsl<afga> {
    private final btvo a;

    public ahym(btvo btvoVar) {
        this.a = btvoVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(afga afgaVar) {
        return this.a.getLocationSharingParameters().v && afgaVar.a().endsWith("RequestLocationIntentActivity");
    }
}
