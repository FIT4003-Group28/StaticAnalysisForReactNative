package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aawk  reason: default package */
/* loaded from: classes.dex */
public final class aawk extends aaqs {
    public String a;
    public String b;
    public boolean c;
    public arsa d;
    public arse s;
    public int t;

    public aawk(aaqf aaqfVar, afvm afvmVar) {
        super("flag/flag", aaqfVar, afvmVar);
        this.t = 1;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arry.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arry arryVar = (arry) createBuilder.instance;
            str.getClass();
            arryVar.b |= 2;
            arryVar.d = str;
        }
        int i = this.t;
        if (i != 0) {
            createBuilder.copyOnWrite();
            arry arryVar2 = (arry) createBuilder.instance;
            arryVar2.e = i - 1;
            arryVar2.b |= 4;
        }
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            createBuilder.copyOnWrite();
            arry arryVar3 = (arry) createBuilder.instance;
            str2.getClass();
            arryVar3.b |= 8;
            arryVar3.f = str2;
        }
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arry arryVar4 = (arry) createBuilder.instance;
        arryVar4.b |= 16;
        arryVar4.g = z;
        arsa arsaVar = this.d;
        if (arsaVar != null) {
            createBuilder.copyOnWrite();
            arry arryVar5 = (arry) createBuilder.instance;
            arryVar5.h = arsaVar;
            arryVar5.b |= 512;
        }
        arse arseVar = this.s;
        if (arseVar != null) {
            createBuilder.copyOnWrite();
            arry arryVar6 = (arry) createBuilder.instance;
            arryVar6.i = arseVar;
            arryVar6.b |= 1024;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!amps.e(this.a));
    }
}
