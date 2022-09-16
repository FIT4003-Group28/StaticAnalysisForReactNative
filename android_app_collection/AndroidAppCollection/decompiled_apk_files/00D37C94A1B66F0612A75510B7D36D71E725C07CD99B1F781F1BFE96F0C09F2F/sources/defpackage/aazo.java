package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aazo  reason: default package */
/* loaded from: classes.dex */
public final class aazo extends aaqs {
    public String a;
    public long b;
    public aqll c;
    public List d;

    /* JADX INFO: Access modifiers changed from: protected */
    public aazo(aaqf aaqfVar, afvm afvmVar, String str, boolean z, boolean z2) {
        super("log_event", aaqfVar, afvmVar, 1, z, str, Boolean.valueOf(z2));
        this.a = "";
        this.b = 0L;
        this.d = new ArrayList();
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!t());
    }

    public final boolean t() {
        return this.d.isEmpty();
    }

    @Override // defpackage.aaqs
    /* renamed from: u */
    public final aopa a() {
        aopa createBuilder = arrj.a.createBuilder();
        createBuilder.ah(this.d);
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        arrj arrjVar = (arrj) createBuilder.instance;
        arrjVar.b |= 2;
        arrjVar.d = currentTimeMillis;
        aopa createBuilder2 = arrn.a.createBuilder();
        long j = this.b;
        if (j != 0) {
            createBuilder2.copyOnWrite();
            arrn arrnVar = (arrn) createBuilder2.instance;
            arrnVar.b |= 2;
            arrnVar.d = j;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder2.copyOnWrite();
            arrn arrnVar2 = (arrn) createBuilder2.instance;
            str.getClass();
            arrnVar2.b |= 1;
            arrnVar2.c = str;
        }
        createBuilder.copyOnWrite();
        arrj arrjVar2 = (arrj) createBuilder.instance;
        arrn arrnVar3 = (arrn) createBuilder2.mo39build();
        arrnVar3.getClass();
        arrjVar2.e = arrnVar3;
        arrjVar2.b |= 4;
        aqll aqllVar = this.c;
        if (aqllVar != null) {
            createBuilder.copyOnWrite();
            arrj arrjVar3 = (arrj) createBuilder.instance;
            arrjVar3.g = aqllVar.f;
            arrjVar3.b |= 32;
        }
        return createBuilder;
    }
}
