package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: aazi  reason: default package */
/* loaded from: classes.dex */
public final class aazi extends aaqs {
    public static final SparseIntArray a = new aazh();
    public String b;
    public String c;
    public int d;
    public int s;

    public aazi(aaqf aaqfVar, afvm afvmVar) {
        super("live/create_ingestion", aaqfVar, afvmVar);
        this.d = 10003;
        this.s = 0;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arpr.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            arpr arprVar = (arpr) createBuilder.instance;
            str.getClass();
            arprVar.b |= 4;
            arprVar.e = str;
        }
        aopa createBuilder2 = arpu.a.createBuilder();
        if (this.s == 1) {
            createBuilder2.copyOnWrite();
            arpu arpuVar = (arpu) createBuilder2.instance;
            arpuVar.d = 4;
            arpuVar.b |= 64;
        } else {
            createBuilder2.copyOnWrite();
            arpu arpuVar2 = (arpu) createBuilder2.instance;
            arpuVar2.d = 1;
            arpuVar2.b |= 64;
        }
        int i = this.d;
        createBuilder2.copyOnWrite();
        arpu arpuVar3 = (arpu) createBuilder2.instance;
        arpuVar3.b = 1 | arpuVar3.b;
        arpuVar3.c = i;
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            createBuilder2.copyOnWrite();
            arpu arpuVar4 = (arpu) createBuilder2.instance;
            str2.getClass();
            arpuVar4.b |= 128;
            arpuVar4.e = str2;
        }
        if (TextUtils.isEmpty(null)) {
            arpu arpuVar5 = (arpu) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            arpr arprVar2 = (arpr) createBuilder.instance;
            arpuVar5.getClass();
            arprVar2.d = arpuVar5;
            arprVar2.b |= 2;
            return createBuilder;
        }
        createBuilder2.copyOnWrite();
        arpu arpuVar6 = (arpu) createBuilder2.instance;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
