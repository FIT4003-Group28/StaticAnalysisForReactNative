package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vye  reason: default package */
/* loaded from: classes7.dex */
final class vye extends vyk {
    private final dbty<Bitmap> b;
    private final String c;

    public vye(Context context, dbty<Bitmap> dbtyVar, String str) {
        super(context);
        this.b = dbtyVar;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vyk
    public final List<RemoteViews> a(vyi vyiVar) {
        return Collections.singletonList(vyj.b(this.a, this.b.a(), this.c, R.layout.notification_image));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vye vyeVar = (vye) obj;
            if (dbsd.a(this.c, vyeVar.c) && this.b.equals(vyeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        String str = this.c;
        return str != null ? str : this.b.toString();
    }
}
