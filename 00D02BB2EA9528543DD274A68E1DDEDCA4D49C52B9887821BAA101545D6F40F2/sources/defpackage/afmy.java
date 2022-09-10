package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afmy  reason: default package */
/* loaded from: classes2.dex */
final class afmy implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ String b;
    final /* synthetic */ afmz c;

    public afmy(afmz afmzVar, List list, String str) {
        this.c = afmzVar;
        this.a = list;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isEmpty()) {
            afmz afmzVar = this.c;
            afoi.g(afmzVar.a, afmzVar.d, this.b);
        } else if (this.a.size() == 1) {
            afmz afmzVar2 = this.c;
            String str = this.b;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setPackage(((ResolveInfo) this.a.get(0)).activityInfo.packageName);
            afmzVar2.b(intent, str);
        } else {
            afmz afmzVar3 = this.c;
            List<ResolveInfo> list = this.a;
            String str2 = this.b;
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : list) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList.add(intent2);
            }
            Intent createChooser = Intent.createChooser(new Intent(), afmzVar3.b.getString(R.string.EXTERNAL_INVOCATION_OPEN_IN_BROWSER_DIALOG_TITLE));
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            afmzVar3.b(createChooser, str2);
        }
    }
}
