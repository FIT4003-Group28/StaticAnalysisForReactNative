package defpackage;

import android.os.Bundle;
/* renamed from: hxe  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hxe implements dbrn {
    static final dbrn a = new hxe();

    private hxe() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Boolean.valueOf(((Bundle) obj).getBoolean("ModAppBarFragment_scrollable", true));
    }
}
