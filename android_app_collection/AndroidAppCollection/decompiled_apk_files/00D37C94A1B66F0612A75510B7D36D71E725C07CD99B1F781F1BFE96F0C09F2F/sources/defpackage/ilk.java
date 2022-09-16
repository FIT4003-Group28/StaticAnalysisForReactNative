package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ilk  reason: default package */
/* loaded from: classes3.dex */
public abstract class ilk {
    public YouTubeTextView c;
    public akbm d;
    final /* synthetic */ iln e;

    public ilk(iln ilnVar) {
        this.e = ilnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(boolean z) {
        akbm akbmVar = this.d;
        if (akbmVar != null) {
            aopc aopcVar = (aopc) apoj.a.createBuilder();
            aopcVar.copyOnWrite();
            apoj apojVar = (apoj) aopcVar.instance;
            apojVar.d = 2;
            apojVar.c = 1;
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apojVar2.b |= 64;
            apojVar2.h = !z;
            akbmVar.b((apoj) aopcVar.mo39build(), null);
            this.c.setFilterTouchesWhenObscured(true);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: ilj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ilk.this.e.a();
                }
            });
            this.c.setEnabled(z);
        }
    }
}
