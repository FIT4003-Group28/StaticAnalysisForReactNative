package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.io.UnsupportedEncodingException;
/* compiled from: PG */
@Deprecated
/* renamed from: cofi  reason: default package */
/* loaded from: classes5.dex */
public class cofi extends cofg {
    public void a() {
    }

    @Override // defpackage.cofg
    public final void c(Intent intent) {
        Bundle bundle;
        String sb;
        if (!"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            return;
        }
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra != null) {
            bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
        } else {
            bundle = null;
        }
        cofh a = cofh.a(this, bundle);
        String stringExtra2 = intent.getStringExtra("CMD");
        if ("RST".equals(stringExtra2)) {
            cofl coflVar = cofh.a;
            String str = a.b;
            synchronized (coflVar) {
                coflVar.c.remove(str);
            }
            Context context = coflVar.b;
            if (TextUtils.isEmpty(str)) {
                sb = "com.google.InstanceId.properties";
            } else {
                try {
                    String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                    sb2.append("com.google.InstanceId_");
                    sb2.append(encodeToString);
                    sb2.append(".properties");
                    sb = sb2.toString();
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            }
            File file = new File(cofj.a(context), sb);
            if (file.exists()) {
                file.delete();
            }
            coflVar.b(String.valueOf(str).concat("|"));
            a();
        } else if ("RST_FULL".equals(stringExtra2)) {
            if (cofh.a.a()) {
                return;
            }
            cofh.a.c();
            a();
        } else if (!"SYNC".equals(stringExtra2)) {
        } else {
            cofl coflVar2 = cofh.a;
            coflVar2.b(String.valueOf(stringExtra).concat("|T|"));
            coflVar2.b(String.valueOf(stringExtra).concat("|T-timestamp|"));
            a();
        }
    }
}
