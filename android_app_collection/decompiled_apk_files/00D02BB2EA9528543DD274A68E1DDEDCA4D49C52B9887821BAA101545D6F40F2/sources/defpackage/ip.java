package defpackage;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ip  reason: default package */
/* loaded from: classes6.dex */
public final class ip {
    public final String a;
    public final CharSequence b;
    public final boolean c = true;
    public final Bundle d;
    public final Set<String> e;

    public ip(String str, CharSequence charSequence, Bundle bundle, Set<String> set) {
        this.a = str;
        this.b = charSequence;
        this.d = bundle;
        this.e = set;
    }

    public static String a(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static RemoteInput[] b(ip[] ipVarArr) {
        RemoteInput[] remoteInputArr = new RemoteInput[ipVarArr.length];
        for (int i = 0; i < ipVarArr.length; i++) {
            remoteInputArr[i] = c(ipVarArr[i]);
        }
        return remoteInputArr;
    }

    public static RemoteInput c(ip ipVar) {
        RemoteInput.Builder choices = new RemoteInput.Builder(ipVar.a).setLabel(ipVar.b).setChoices(null);
        boolean z = ipVar.c;
        RemoteInput.Builder addExtras = choices.setAllowFreeFormInput(true).addExtras(ipVar.d);
        if (Build.VERSION.SDK_INT >= 29) {
            addExtras.setEditChoicesBeforeSending(0);
        }
        return addExtras.build();
    }

    public static Intent d(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return null;
        }
        return clipData.getItemAt(0).getIntent();
    }
}
