package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agg  reason: default package */
/* loaded from: classes.dex */
public final class agg extends agu {
    final /* synthetic */ agi a;

    public agg(agi agiVar) {
        this.a = agiVar;
    }

    @Override // defpackage.agu
    public final <I, O> void a(int i, agz<I, O> agzVar, I i2) {
        Bundle bundle;
        agi agiVar = this.a;
        agy<O> c = agzVar.c(agiVar, i2);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new age(this, i, c));
            return;
        }
        Intent b = agzVar.b(i2);
        if (b.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = b.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            b.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(b.getAction())) {
            String[] stringArrayExtra = b.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : stringArrayExtra) {
                if (this.a.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            for (String str2 : strArr) {
                if (TextUtils.isEmpty(str2)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (agiVar instanceof aju) {
                    aju ajuVar = (aju) agiVar;
                }
                agiVar.requestPermissions(strArr, i);
            } else if (agiVar instanceof ajt) {
                new Handler(Looper.getMainLooper()).post(new ajr(strArr, agiVar, i));
            }
        } else if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(b.getAction())) {
            agiVar.startActivityForResult(b, i, bundle);
        } else {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) b.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                agiVar.startIntentSenderForResult(intentSenderRequest.a, i, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new agf(this, i, e));
            }
        }
    }
}
