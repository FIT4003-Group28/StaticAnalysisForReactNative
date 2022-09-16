package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: km  reason: default package */
/* loaded from: classes3.dex */
public final class km extends kr {
    public km(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ld.c(view));
    }
}
