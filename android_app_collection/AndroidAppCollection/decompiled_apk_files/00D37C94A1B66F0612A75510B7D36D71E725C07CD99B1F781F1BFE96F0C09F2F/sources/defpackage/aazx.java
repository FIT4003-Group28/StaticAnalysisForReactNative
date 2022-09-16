package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aazx  reason: default package */
/* loaded from: classes.dex */
public final class aazx extends aaqs {
    public String a;
    public String[] b;
    public boolean c;
    public int d;

    public aazx(aaqf aaqfVar, afvm afvmVar) {
        super("notification/modify_channel_preference", aaqfVar, afvmVar);
        this.b = new String[0];
        this.d = 1;
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arye.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        arye aryeVar = (arye) createBuilder.instance;
        str.getClass();
        aryeVar.b |= 2;
        aryeVar.d = str;
        List asList = Arrays.asList(this.b);
        createBuilder.copyOnWrite();
        arye aryeVar2 = (arye) createBuilder.instance;
        aopu aopuVar = aryeVar2.e;
        if (!aopuVar.c()) {
            aryeVar2.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) asList, (List) aryeVar2.e);
        boolean z = this.c;
        createBuilder.copyOnWrite();
        arye aryeVar3 = (arye) createBuilder.instance;
        aryeVar3.b |= 4;
        aryeVar3.f = z;
        int i = this.d;
        createBuilder.copyOnWrite();
        arye aryeVar4 = (arye) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            aryeVar4.g = i2;
            aryeVar4.b |= 8;
            return createBuilder;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        zgh.m(this.a);
    }
}
