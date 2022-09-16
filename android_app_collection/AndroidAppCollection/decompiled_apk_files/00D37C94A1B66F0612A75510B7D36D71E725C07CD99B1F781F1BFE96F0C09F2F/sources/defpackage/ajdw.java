package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajdw  reason: default package */
/* loaded from: classes.dex */
final class ajdw extends aaww {
    public List d;
    public aoob s;
    public String t;
    private String u;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajdw(aaqf aaqfVar, afvm afvmVar) {
        super(aaqfVar, afvmVar);
    }

    @Override // defpackage.aaww, defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaww, defpackage.aapd
    public final void c() {
        zgh.m(this.u);
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ajea ajeaVar : this.d) {
            if (ajeaVar != null) {
                a();
            }
        }
    }

    @Override // defpackage.aaww
    public final void t(String str) {
        ((aaww) this).a = str;
        this.u = str;
    }

    @Override // defpackage.aaww
    public final aopa u() {
        aopa createBuilder = arze.a.createBuilder();
        String str = this.u;
        createBuilder.copyOnWrite();
        arze arzeVar = (arze) createBuilder.instance;
        str.getClass();
        arzeVar.b |= 2;
        arzeVar.d = str;
        aoob aoobVar = this.s;
        if (aoobVar != null) {
            createBuilder.copyOnWrite();
            arze arzeVar2 = (arze) createBuilder.instance;
            arzeVar2.b |= 64;
            arzeVar2.h = aoobVar;
        }
        String str2 = this.t;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            arze arzeVar3 = (arze) createBuilder.instance;
            arzeVar3.b |= 16;
            arzeVar3.f = str2;
        }
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            for (ajea ajeaVar : this.d) {
                if (ajeaVar != null) {
                    ajeaVar.a(this, createBuilder);
                }
            }
        }
        return createBuilder;
    }
}
