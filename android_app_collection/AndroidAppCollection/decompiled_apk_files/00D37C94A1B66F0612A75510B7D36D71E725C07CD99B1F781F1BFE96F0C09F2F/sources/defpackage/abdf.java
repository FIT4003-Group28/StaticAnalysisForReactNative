package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: abdf  reason: default package */
/* loaded from: classes.dex */
public final class abdf extends aaqs {
    public String a;
    public String b;
    public final aopa c;
    private final Set d;

    public abdf(aaqf aaqfVar, afvm afvmVar) {
        super("subscription/subscribe", aaqfVar, afvmVar);
        this.d = new HashSet();
        this.c = ator.a.createBuilder();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asdf.a.createBuilder();
        Set set = this.d;
        createBuilder.copyOnWrite();
        asdf asdfVar = (asdf) createBuilder.instance;
        aopu aopuVar = asdfVar.d;
        if (!aopuVar.c()) {
            asdfVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) set, (List) asdfVar.d);
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asdf asdfVar2 = (asdf) createBuilder.instance;
            str.getClass();
            asdfVar2.b |= 2;
            asdfVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            asdf asdfVar3 = (asdf) createBuilder.instance;
            str2.getClass();
            asdfVar3.b |= 4;
            asdfVar3.f = str2;
        }
        ator atorVar = (ator) this.c.mo39build();
        createBuilder.copyOnWrite();
        asdf asdfVar4 = (asdf) createBuilder.instance;
        atorVar.getClass();
        asdfVar4.g = atorVar;
        asdfVar4.b |= 8;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.d.size() > 0);
    }

    public final void t(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.add(str);
        }
    }
}
