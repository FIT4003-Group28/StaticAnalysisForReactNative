package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajjy  reason: default package */
/* loaded from: classes2.dex */
public final class ajjy extends ajnf {
    public eaow a;
    public eapd b;
    public dcep<btlu> c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public dcep<dqym> g;
    public dqyy h;
    public dqza i;
    public dqzg j;

    @Override // defpackage.ajnf
    public final dcep<btlu> a() {
        dcep<btlu> dcepVar = this.c;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"accounts\" has not been set");
    }

    @Override // defpackage.ajnf
    public final dcep<dqym> b() {
        dcep<dqym> dcepVar = this.g;
        if (dcepVar != null) {
            return dcepVar;
        }
        throw new IllegalStateException("Property \"collectionReasons\" has not been set");
    }
}
