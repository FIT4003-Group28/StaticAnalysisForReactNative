package defpackage;

import android.content.Context;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rck  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rck implements Callable {
    public final /* synthetic */ rcn a;
    private final /* synthetic */ int b;

    public /* synthetic */ rck(rcn rcnVar) {
        this.a = rcnVar;
    }

    public /* synthetic */ rck(rcn rcnVar, int i) {
        this.b = i;
        this.a = rcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            Context context = this.a.a;
            return tzh.n(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        }
        Context context2 = this.a.a;
        aopa createBuilder = dnw.a.createBuilder();
        qab qabVar = new qab(context2);
        qabVar.c();
        qaa e = qabVar.e();
        String str = e.a;
        if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(str);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            str = Base64.encodeToString(bArr, 11);
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            dnw dnwVar = (dnw) createBuilder.instance;
            dnwVar.d |= 512;
            dnwVar.ab = str;
            boolean z = e.b;
            createBuilder.copyOnWrite();
            dnw dnwVar2 = (dnw) createBuilder.instance;
            dnwVar2.d |= 2048;
            dnwVar2.ad = z;
            createBuilder.copyOnWrite();
            dnw dnwVar3 = (dnw) createBuilder.instance;
            dnwVar3.ac = 5;
            dnwVar3.d |= 1024;
        }
        return (dnw) createBuilder.mo39build();
    }
}
