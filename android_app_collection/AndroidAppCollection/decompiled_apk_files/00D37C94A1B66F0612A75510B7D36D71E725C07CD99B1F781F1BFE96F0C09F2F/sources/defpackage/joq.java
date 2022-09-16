package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: joq  reason: default package */
/* loaded from: classes3.dex */
public final class joq implements yiw {
    private final /* synthetic */ int a;

    public joq() {
    }

    public joq(int i) {
        this.a = i;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            String str = (String) obj;
            Boolean bool = (Boolean) obj2;
        } else if (i == 1) {
            Uri uri = (Uri) obj;
            Drawable drawable = (Drawable) obj2;
        } else if (i == 2) {
            adig adigVar = (adig) obj;
            Boolean bool2 = (Boolean) obj2;
        } else if (i == 3) {
            adig adigVar2 = (adig) obj;
            Boolean bool3 = (Boolean) obj2;
        } else {
            Uri uri2 = (Uri) obj;
            Bitmap bitmap = (Bitmap) obj2;
        }
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        int i = this.a;
        if (i == 0) {
            String str = (String) obj;
        } else if (i == 1) {
            Uri uri = (Uri) obj;
        } else if (i != 2) {
            if (i == 3) {
                adig adigVar = (adig) obj;
            } else {
                Uri uri2 = (Uri) obj;
            }
        } else {
            adig adigVar2 = (adig) obj;
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Error connecting to screen: ");
            sb.append(valueOf);
            zep.b(sb.toString());
        }
    }
}
