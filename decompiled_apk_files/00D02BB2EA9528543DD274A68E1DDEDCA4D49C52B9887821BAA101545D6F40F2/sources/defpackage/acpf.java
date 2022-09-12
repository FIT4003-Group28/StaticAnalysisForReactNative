package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acpf  reason: default package */
/* loaded from: classes2.dex */
public final class acpf {
    public static boolean a(View view) {
        return (view.getContext().getResources().getConfiguration().screenLayout & 192) == 128;
    }
}
