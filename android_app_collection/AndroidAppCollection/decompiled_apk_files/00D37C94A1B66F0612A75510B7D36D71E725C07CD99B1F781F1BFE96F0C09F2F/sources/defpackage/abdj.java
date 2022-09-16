package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: abdj  reason: default package */
/* loaded from: classes.dex */
public final class abdj extends aaqs {
    public String a;
    public String b;
    private final Set c;

    public abdj(aaqf aaqfVar, afvm afvmVar) {
        super("subscription/unsubscribe", aaqfVar, afvmVar);
        this.c = new HashSet();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asdh.a.createBuilder();
        Set set = this.c;
        createBuilder.copyOnWrite();
        asdh asdhVar = (asdh) createBuilder.instance;
        aopu aopuVar = asdhVar.d;
        if (!aopuVar.c()) {
            asdhVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) set, (List) asdhVar.d);
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asdh asdhVar2 = (asdh) createBuilder.instance;
            str.getClass();
            asdhVar2.b |= 2;
            asdhVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asdh asdhVar3 = (asdh) createBuilder.instance;
            str2.getClass();
            asdhVar3.b |= 4;
            asdhVar3.f = str2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.c.size() > 0);
    }

    public final void t(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.c.add(str);
        }
    }
}
