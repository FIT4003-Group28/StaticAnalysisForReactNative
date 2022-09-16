package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: rbl  reason: default package */
/* loaded from: classes4.dex */
public final class rbl extends qxb {
    public final Context a;

    public rbl(Context context, Looper looper, qsv qsvVar, qsw qswVar, qwu qwuVar) {
        super(context, looper, 29, qwuVar, qsvVar, qswVar);
        this.a = context;
        rxq.b(context);
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 11925000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof rbo) {
            return (rbo) queryLocalInterface;
        }
        return new rbo(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rba.b;
    }

    public final void k(FeedbackOptions feedbackOptions) {
        String str;
        aopa createBuilder = req.a.createBuilder();
        String str2 = feedbackOptions.g;
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            req reqVar = (req) createBuilder.instance;
            str2.getClass();
            reqVar.b |= 2;
            reqVar.d = str2;
        } else {
            String packageName = this.a.getApplicationContext().getPackageName();
            createBuilder.copyOnWrite();
            req reqVar2 = (req) createBuilder.instance;
            packageName.getClass();
            reqVar2.b |= 2;
            reqVar2.d = packageName;
        }
        try {
            str = this.a.getPackageManager().getPackageInfo(((req) createBuilder.instance).d, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            req reqVar3 = (req) createBuilder.instance;
            reqVar3.c |= 2;
            reqVar3.k = str;
        }
        String str3 = feedbackOptions.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            createBuilder.copyOnWrite();
            req reqVar4 = (req) createBuilder.instance;
            num.getClass();
            reqVar4.b |= 4;
            reqVar4.e = num;
        }
        String str4 = feedbackOptions.n;
        if (str4 != null) {
            createBuilder.copyOnWrite();
            req reqVar5 = (req) createBuilder.instance;
            reqVar5.b |= 64;
            reqVar5.g = str4;
        }
        createBuilder.copyOnWrite();
        req reqVar6 = (req) createBuilder.instance;
        reqVar6.b |= 16;
        reqVar6.f = "feedback.android";
        int i = qrq.b;
        createBuilder.copyOnWrite();
        req reqVar7 = (req) createBuilder.instance;
        reqVar7.b |= 1073741824;
        reqVar7.j = i;
        long currentTimeMillis = System.currentTimeMillis();
        createBuilder.copyOnWrite();
        req reqVar8 = (req) createBuilder.instance;
        reqVar8.b |= 16777216;
        reqVar8.i = currentTimeMillis;
        if (feedbackOptions.m != null || feedbackOptions.f != null) {
            createBuilder.copyOnWrite();
            req reqVar9 = (req) createBuilder.instance;
            reqVar9.c |= 16;
            reqVar9.n = true;
        }
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = feedbackOptions.b.size();
            createBuilder.copyOnWrite();
            req reqVar10 = (req) createBuilder.instance;
            reqVar10.c |= 4;
            reqVar10.l = size;
        }
        List list = feedbackOptions.h;
        if (list != null && !list.isEmpty()) {
            int size2 = feedbackOptions.h.size();
            createBuilder.copyOnWrite();
            req reqVar11 = (req) createBuilder.instance;
            reqVar11.c |= 8;
            reqVar11.m = size2;
        }
        aopa mo52toBuilder = ((req) createBuilder.mo39build()).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        req reqVar12 = (req) mo52toBuilder.instance;
        reqVar12.h = 164;
        reqVar12.b |= 256;
        req reqVar13 = (req) mo52toBuilder.mo39build();
        Context context = this.a;
        if (TextUtils.isEmpty(reqVar13.d)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (TextUtils.isEmpty(reqVar13.g)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (TextUtils.isEmpty(reqVar13.f)) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (reqVar13.j <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (reqVar13.i <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int b = awwc.b(reqVar13.h);
        if (b == 0 || b == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", reqVar13.toByteArray()));
    }
}
