package defpackage;
/* compiled from: PG */
/* renamed from: ansi  reason: default package */
/* loaded from: classes.dex */
public final class ansi implements anmz {
    private final /* synthetic */ int a;

    public ansi() {
    }

    public ansi(int i) {
        this.a = i;
    }

    @Override // defpackage.anmz
    public final Class a() {
        return this.a != 0 ? anmk.class : annb.class;
    }

    @Override // defpackage.anmz
    public final Class b() {
        return this.a != 0 ? anmk.class : annb.class;
    }

    @Override // defpackage.anmz
    public final /* bridge */ /* synthetic */ Object c(anmy anmyVar) {
        return this.a != 0 ? new anpe(anmyVar) : new ansh();
    }
}
