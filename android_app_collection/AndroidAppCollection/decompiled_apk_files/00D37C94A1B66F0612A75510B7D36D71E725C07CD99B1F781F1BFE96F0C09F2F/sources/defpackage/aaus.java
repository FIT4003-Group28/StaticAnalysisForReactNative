package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaus  reason: default package */
/* loaded from: classes.dex */
public final class aaus extends aaqs {
    public String a;
    public List b;

    public aaus(aaqf aaqfVar, afvm afvmVar) {
        super("share/get_old_share_panel", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = armx.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        armx armxVar = (armx) createBuilder.instance;
        str.getClass();
        armxVar.b |= 2;
        armxVar.d = str;
        List list = this.b;
        if (list != null) {
            createBuilder.copyOnWrite();
            armx armxVar2 = (armx) createBuilder.instance;
            aopq aopqVar = armxVar2.e;
            if (!aopqVar.c()) {
                armxVar2.e = aopi.mutableCopy(aopqVar);
            }
            aonk.addAll((Iterable) list, (List) armxVar2.e);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
