package com.google.android.libraries.youtube.mdx.background;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxBackgroundScanBootReceiver extends acxf {
    private static final String b = zep.a("MDX.BootReceiver");
    public acxv a;

    @Override // defpackage.acxf, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        zep.h(b, "MdxBackgroundScanBootReceiver: onReceive");
        this.a.a();
    }
}
