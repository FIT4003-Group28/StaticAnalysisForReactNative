package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abyx  reason: default package */
/* loaded from: classes.dex */
public final class abyx extends aaqs {
    public String a;
    public String b;
    public long c;
    public int d;
    public int s;

    public abyx(aaqf aaqfVar, afvm afvmVar) {
        super("live/create_livestream_highlight_clip", aaqfVar, afvmVar, 1, true);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arpy.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arpy arpyVar = (arpy) createBuilder.instance;
            str.getClass();
            arpyVar.b |= 8;
            arpyVar.f = str;
        }
        aopa createBuilder2 = arqb.a.createBuilder();
        int i = this.s;
        if (i != 0) {
            createBuilder2.copyOnWrite();
            arqb arqbVar = (arqb) createBuilder2.instance;
            arqbVar.c = i - 1;
            arqbVar.b |= 1;
        }
        if (TextUtils.isEmpty(null)) {
            createBuilder.copyOnWrite();
            arpy arpyVar2 = (arpy) createBuilder.instance;
            arqb arqbVar2 = (arqb) createBuilder2.mo39build();
            arqbVar2.getClass();
            arpyVar2.e = arqbVar2;
            arpyVar2.b |= 4;
            if (!TextUtils.isEmpty(this.b)) {
                String str2 = this.b;
                createBuilder.copyOnWrite();
                arpy arpyVar3 = (arpy) createBuilder.instance;
                str2.getClass();
                arpyVar3.b |= 16;
                arpyVar3.g = str2;
            }
            aopa createBuilder3 = arqe.a.createBuilder();
            aopa createBuilder4 = arqc.a.createBuilder();
            aopa createBuilder5 = aooo.a.createBuilder();
            long j = this.c;
            createBuilder5.copyOnWrite();
            ((aooo) createBuilder5.instance).b = j;
            int i2 = this.d;
            createBuilder5.copyOnWrite();
            ((aooo) createBuilder5.instance).c = i2;
            createBuilder4.copyOnWrite();
            arqc arqcVar = (arqc) createBuilder4.instance;
            aooo aoooVar = (aooo) createBuilder5.mo39build();
            aoooVar.getClass();
            arqcVar.c = aoooVar;
            arqcVar.b |= 1;
            createBuilder3.copyOnWrite();
            arqe arqeVar = (arqe) createBuilder3.instance;
            arqc arqcVar2 = (arqc) createBuilder4.mo39build();
            arqcVar2.getClass();
            arqeVar.c = arqcVar2;
            arqeVar.b = 2;
            createBuilder.copyOnWrite();
            arpy arpyVar4 = (arpy) createBuilder.instance;
            arqe arqeVar2 = (arqe) createBuilder3.mo39build();
            arqeVar2.getClass();
            aopu aopuVar = arpyVar4.d;
            if (!aopuVar.c()) {
                arpyVar4.d = aopi.mutableCopy(aopuVar);
            }
            arpyVar4.d.add(arqeVar2);
            aopa createBuilder6 = arqa.a.createBuilder();
            if (TextUtils.isEmpty(null)) {
                if (TextUtils.isEmpty(null)) {
                    createBuilder.copyOnWrite();
                    arpy arpyVar5 = (arpy) createBuilder.instance;
                    arqa arqaVar = (arqa) createBuilder6.mo39build();
                    arqaVar.getClass();
                    arpyVar5.h = arqaVar;
                    arpyVar5.b |= 32;
                    return createBuilder;
                }
                createBuilder6.copyOnWrite();
                arqa arqaVar2 = (arqa) createBuilder6.instance;
                throw null;
            }
            createBuilder6.copyOnWrite();
            arqa arqaVar3 = (arqa) createBuilder6.instance;
            throw null;
        }
        createBuilder2.copyOnWrite();
        arqb arqbVar3 = (arqb) createBuilder2.instance;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = true;
        aqxo.y(!TextUtils.isEmpty(this.a));
        aqxo.y(this.c >= 0);
        aqxo.y(this.d >= 0);
        if (this.c + this.d <= 0) {
            z = false;
        }
        aqxo.y(z);
    }
}
