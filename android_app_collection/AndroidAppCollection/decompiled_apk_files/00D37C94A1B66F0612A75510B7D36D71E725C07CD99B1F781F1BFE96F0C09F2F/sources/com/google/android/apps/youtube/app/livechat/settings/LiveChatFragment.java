package com.google.android.apps.youtube.app.livechat.settings;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LiveChatFragment extends ivh {
    public akjl c;
    public SettingsDataAccess d;
    private aypg e;

    @Override // defpackage.bjr, defpackage.dp
    public final void Z(View view, Bundle bundle) {
        super.Z(view, bundle);
        this.e = this.d.g(new Runnable() { // from class: ivi
            @Override // java.lang.Runnable
            public final void run() {
                aurh o;
                arag aragVar;
                LiveChatFragment liveChatFragment = LiveChatFragment.this;
                if (liveChatFragment.ap() && (o = liveChatFragment.d.o(10034)) != null) {
                    dt mJ = liveChatFragment.mJ();
                    if ((o.b & 1) != 0) {
                        aragVar = o.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    mJ.setTitle(ajgl.b(aragVar));
                    liveChatFragment.c.d(liveChatFragment, o.d);
                }
            }
        });
    }

    @Override // defpackage.bjr
    public final void aG() {
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        azof.f((AtomicReference) this.e);
    }
}
