package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
/* compiled from: PG */
/* renamed from: cbe  reason: default package */
/* loaded from: classes4.dex */
public final class cbe<Data> implements cap<Integer, Data> {
    private final cap<Uri, Data> a;
    private final Resources b;

    public cbe(Resources resources, cap<Uri, Data> capVar) {
        this.b = resources;
        this.a = capVar;
    }

    private final Uri c(Integer num) {
        try {
            String resourcePackageName = this.b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.b.getResourceEntryName(num.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(valueOf);
            sb2.toString();
            return null;
        }
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(Integer num, int i, int i2, bua buaVar) {
        Uri c = c(num);
        if (c == null) {
            return null;
        }
        return this.a.b(c, i, i2, buaVar);
    }
}
