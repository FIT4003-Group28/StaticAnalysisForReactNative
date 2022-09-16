package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements ynl {
    public final f a;
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d b;
    public c c;
    public ahia d;
    public aika e;
    public auao f;
    public auan g;
    public auap h;
    public final azpm i;
    private final Context j;

    public d(Context context, f fVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.d dVar, final com.google.android.apps.youtube.embeddedplayer.service.databus.service.a aVar) {
        azpm e = azpm.e();
        this.i = e;
        this.j = context;
        this.a = fVar;
        this.b = dVar;
        e.as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.b
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                com.google.android.apps.youtube.embeddedplayer.service.databus.service.a.this.a((MutedAutoplayState) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r6, java.lang.Object r7, int r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service.d.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    public final void a(int i) {
        SelectableItemKey selectableItemKey;
        SelectableItemKey selectableItemKey2;
        CharSequence string;
        MutedAutoplayState mutedAutoplayState;
        arag aragVar;
        auan auanVar;
        azpm azpmVar = this.i;
        auao auaoVar = this.f;
        if (auaoVar == null) {
            mutedAutoplayState = MutedAutoplayState.a;
        } else {
            c cVar = this.c;
            cVar.f = auaoVar;
            cVar.d.append(1, auaoVar);
            SelectableItemKey selectableItemKey3 = cVar.a;
            c cVar2 = this.c;
            auan auanVar2 = this.g;
            if (auanVar2 == null) {
                selectableItemKey = cVar2.a;
            } else {
                cVar2.d.append(2, auanVar2);
                selectableItemKey = cVar2.b;
            }
            SelectableItemKey selectableItemKey4 = selectableItemKey;
            c cVar3 = this.c;
            auap auapVar = this.h;
            if (auapVar == null) {
                selectableItemKey2 = cVar3.a;
            } else {
                cVar3.d.append(3, auapVar);
                selectableItemKey2 = cVar3.c;
            }
            SelectableItemKey selectableItemKey5 = selectableItemKey2;
            auan auanVar3 = this.g;
            if (auanVar3 != null) {
                if ((auanVar3.b & 1) != 0) {
                    aragVar = auanVar3.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                string = ajgl.b(aragVar);
            } else {
                string = this.j.getString(R.string.continue_watching);
            }
            CharSequence charSequence = string;
            auap auapVar2 = this.h;
            mutedAutoplayState = new MutedAutoplayState(selectableItemKey3, selectableItemKey4, selectableItemKey5, charSequence, auapVar2 != null ? auapVar2.c : 3000L, i);
        }
        azpmVar.c(mutedAutoplayState);
        if (i == 1) {
            auao auaoVar2 = this.f;
            if (auaoVar2 == null) {
                return;
            }
            this.a.q(auaoVar2.f.I());
        } else if (i != 2 || (auanVar = this.g) == null) {
        } else {
            this.a.q(auanVar.d.I());
        }
    }
}
