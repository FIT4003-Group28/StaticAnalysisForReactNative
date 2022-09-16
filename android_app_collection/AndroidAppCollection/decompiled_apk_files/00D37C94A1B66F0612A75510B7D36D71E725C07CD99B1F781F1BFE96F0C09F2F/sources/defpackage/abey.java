package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: abey  reason: default package */
/* loaded from: classes.dex */
public final class abey extends aaqs {
    public String a;
    public String b;
    public List c;
    private List d;

    public abey(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/cancel_recurrence", aaqfVar, afvmVar);
        this.a = "";
        this.b = "";
        this.d = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(((ashk) a().mo39build()).d);
    }

    public final void t(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.d = list;
    }

    @Override // defpackage.aaqs
    /* renamed from: u */
    public final aopa a() {
        aopa createBuilder = ashk.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        ashk ashkVar = (ashk) createBuilder.instance;
        str.getClass();
        ashkVar.b |= 2;
        ashkVar.d = str;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            ashk ashkVar2 = (ashk) createBuilder.instance;
            str2.getClass();
            ashkVar2.b |= 8;
            ashkVar2.f = str2;
        }
        aopa createBuilder2 = awir.a.createBuilder();
        List list = this.d;
        if (list != null) {
            createBuilder2.copyOnWrite();
            awir awirVar = (awir) createBuilder2.instance;
            aopu aopuVar = awirVar.b;
            if (!aopuVar.c()) {
                awirVar.b = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) awirVar.b);
        }
        List list2 = this.c;
        if (list2 != null) {
            createBuilder2.copyOnWrite();
            awir awirVar2 = (awir) createBuilder2.instance;
            aopu aopuVar2 = awirVar2.c;
            if (!aopuVar2.c()) {
                awirVar2.c = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) list2, (List) awirVar2.c);
        }
        createBuilder.copyOnWrite();
        ashk ashkVar3 = (ashk) createBuilder.instance;
        awir awirVar3 = (awir) createBuilder2.mo39build();
        awirVar3.getClass();
        ashkVar3.e = awirVar3;
        ashkVar3.b |= 4;
        return createBuilder;
    }
}
