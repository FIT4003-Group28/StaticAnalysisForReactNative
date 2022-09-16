package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abef  reason: default package */
/* loaded from: classes.dex */
public final class abef extends aaqs {
    public final List a;
    public String b;
    public String c;

    public abef(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/commerce_action", aaqfVar, afvmVar);
        this.b = "";
        this.c = "";
        this.a = new ArrayList();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = aroi.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            aroi aroiVar = (aroi) createBuilder.instance;
            str.getClass();
            aroiVar.b |= 2;
            aroiVar.d = str;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            createBuilder.copyOnWrite();
            aroi aroiVar2 = (aroi) createBuilder.instance;
            str2.getClass();
            aroiVar2.b |= 4;
            aroiVar2.e = str2;
        }
        if (!this.a.isEmpty()) {
            List list = this.a;
            createBuilder.copyOnWrite();
            aroi aroiVar3 = (aroi) createBuilder.instance;
            aopu aopuVar = aroiVar3.f;
            if (!aopuVar.c()) {
                aroiVar3.f = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) aroiVar3.f);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!TextUtils.isEmpty(this.b));
    }
}
