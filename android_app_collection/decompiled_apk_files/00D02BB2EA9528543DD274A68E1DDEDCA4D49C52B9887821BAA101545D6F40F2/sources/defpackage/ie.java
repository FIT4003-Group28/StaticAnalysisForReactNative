package defpackage;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ie  reason: default package */
/* loaded from: classes6.dex */
public final class ie extends ih {
    private final ArrayList<CharSequence> a = new ArrayList<>();

    @Override // defpackage.ih
    protected final String a() {
        return "android.support.v4.app.NotificationCompat$InboxStyle";
    }

    @Override // defpackage.ih
    public final void b(hw hwVar) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(((ii) hwVar).a).setBigContentTitle(this.e);
        if (this.g) {
            bigContentTitle.setSummaryText(this.f);
        }
        ArrayList<CharSequence> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bigContentTitle.addLine(arrayList.get(i));
        }
    }

    @Override // defpackage.ih
    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.putCharSequenceArray("android.textLines", (CharSequence[]) this.a.toArray(new CharSequence[this.a.size()]));
    }

    @Override // defpackage.ih
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.a.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(this.a, bundle.getCharSequenceArray("android.textLines"));
        }
    }

    public final void h(CharSequence charSequence) {
        if (charSequence != null) {
            this.a.add(ib.c(charSequence));
        }
    }

    public final void i(CharSequence charSequence) {
        this.e = ib.c(charSequence);
    }
}
