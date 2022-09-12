package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
/* compiled from: PG */
/* renamed from: bwbz  reason: default package */
/* loaded from: classes4.dex */
public final class bwbz {
    public static final afin a = new afin();
    public final bwca b;

    public bwbz(bwca bwcaVar) {
        this.b = bwcaVar;
    }

    @dzsi
    public static Intent a(String str) {
        try {
            return Intent.parseUri(str, TextUtils.equals(Uri.parse(str).getScheme(), "intent") ? 1 : 0);
        } catch (URISyntaxException unused) {
            return null;
        }
    }
}
