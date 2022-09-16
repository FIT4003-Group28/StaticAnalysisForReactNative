package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
/* compiled from: PG */
/* renamed from: coa  reason: default package */
/* loaded from: classes2.dex */
public final class coa implements cnq {
    private final cnq a;
    private final Resources b;

    public coa(Resources resources, cnq cnqVar) {
        this.b = resources;
        this.a = cnqVar;
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
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(valueOf);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        Uri c = c((Integer) obj);
        if (c == null) {
            return null;
        }
        return this.a.a(c, i, i2, cicVar);
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
