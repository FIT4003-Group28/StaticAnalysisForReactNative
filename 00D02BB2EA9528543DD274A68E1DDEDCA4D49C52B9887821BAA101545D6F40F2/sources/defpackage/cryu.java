package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cryu  reason: default package */
/* loaded from: classes5.dex */
public final class cryu {
    private final Context a;
    @dzsi
    private final ClipboardManager b;

    public cryu(Context context, @dzsi ClipboardManager clipboardManager) {
        this.a = context;
        this.b = clipboardManager;
    }

    private static cryq<CharSequence> b() {
        cryp c = cryq.c();
        c.b(dcdc.e());
        ((cryi) c).a = dbpy.a;
        return c.c();
    }

    public final cryq<CharSequence> a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
            ClipboardManager clipboardManager2 = this.b;
            if (clipboardManager2 != null) {
                clipboardManager2.hasPrimaryClip();
            }
            return b();
        }
        try {
            ArrayList arrayList = new ArrayList();
            ClipData primaryClip = this.b.getPrimaryClip();
            if (primaryClip != null) {
                for (int i = 0; i < primaryClip.getItemCount(); i++) {
                    arrayList.add(primaryClip.getItemAt(i).coerceToText(this.a));
                }
                arrayList.size();
                cryp c = cryq.c();
                c.b(dcdc.r(arrayList));
                ((cryi) c).a = dbsg.i(Long.valueOf(primaryClip.getDescription().getTimestamp()));
                return c.c();
            }
            return b();
        } catch (RuntimeException unused) {
            return b();
        }
    }
}
