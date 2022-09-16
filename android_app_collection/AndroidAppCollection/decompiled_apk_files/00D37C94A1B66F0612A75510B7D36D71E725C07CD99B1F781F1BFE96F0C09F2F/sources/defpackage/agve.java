package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: agve  reason: default package */
/* loaded from: classes.dex */
public final class agve extends aaqs {
    public Collection a;
    public String b;

    public agve(aaqf aaqfVar, afvm afvmVar) {
        super("player/refresh", aaqfVar, afvmVar);
        this.a = new ArrayList();
        this.b = "";
        this.g = aadi.b;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arzg.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arzg arzgVar = (arzg) createBuilder.instance;
        str.getClass();
        arzgVar.b |= 2;
        arzgVar.e = str;
        Collection collection = this.a;
        createBuilder.copyOnWrite();
        arzg arzgVar2 = (arzg) createBuilder.instance;
        aopu aopuVar = arzgVar2.d;
        if (!aopuVar.c()) {
            arzgVar2.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) collection, (List) arzgVar2.d);
        createBuilder.copyOnWrite();
        arzg arzgVar3 = (arzg) createBuilder.instance;
        arzgVar3.b |= 4;
        arzgVar3.f = true;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.k);
        if (TextUtils.isEmpty(this.b)) {
            aqxo.y(!this.a.isEmpty());
        } else {
            zgh.m(this.b);
        }
    }
}
