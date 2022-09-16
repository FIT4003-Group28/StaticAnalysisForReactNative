package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aawg  reason: default package */
/* loaded from: classes.dex */
public final class aawg extends aaqs {
    public String a;
    public Boolean b;
    public Long c;
    private final ArrayList d;
    private Boolean s;

    public aawg(aaqf aaqfVar, afvm afvmVar) {
        super("feedback", aaqfVar, afvmVar);
        this.d = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arrv.a.createBuilder();
        ArrayList arrayList = this.d;
        createBuilder.copyOnWrite();
        arrv arrvVar = (arrv) createBuilder.instance;
        aopu aopuVar = arrvVar.d;
        if (!aopuVar.c()) {
            arrvVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) arrayList, (List) arrvVar.d);
        Boolean bool = this.b;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            createBuilder.copyOnWrite();
            arrv arrvVar2 = (arrv) createBuilder.instance;
            arrvVar2.b |= 8;
            arrvVar2.g = booleanValue;
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            createBuilder.copyOnWrite();
            arrv arrvVar3 = (arrv) createBuilder.instance;
            arrvVar3.b |= 2;
            arrvVar3.e = booleanValue2;
        }
        aopa createBuilder2 = arrs.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder2.copyOnWrite();
            arrs arrsVar = (arrs) createBuilder2.instance;
            str.getClass();
            arrsVar.b |= 1;
            arrsVar.e = str;
        }
        Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder2.copyOnWrite();
            arrs arrsVar2 = (arrs) createBuilder2.instance;
            arrsVar2.c = 2;
            arrsVar2.d = Long.valueOf(longValue);
        }
        createBuilder.copyOnWrite();
        arrv arrvVar4 = (arrv) createBuilder.instance;
        arrs arrsVar3 = (arrs) createBuilder2.mo39build();
        arrsVar3.getClass();
        arrvVar4.f = arrsVar3;
        arrvVar4.b |= 4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(this.d.size() > 0);
    }

    public final void t(String str) {
        this.d.add(str);
    }

    public final void u(boolean z) {
        this.s = Boolean.valueOf(z);
    }
}
