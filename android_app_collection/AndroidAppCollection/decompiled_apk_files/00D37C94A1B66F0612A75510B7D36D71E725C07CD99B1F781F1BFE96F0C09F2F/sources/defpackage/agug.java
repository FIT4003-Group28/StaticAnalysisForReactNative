package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agug  reason: default package */
/* loaded from: classes.dex */
public final class agug implements aguk {
    private final Context a;
    private final Executor b;
    private final aimr c;
    private final yrj d;
    private final agup e;
    private final ague f;
    private final azqb g;
    private final axwu h;
    private final jjt i;

    public agug(Context context, Executor executor, aimr aimrVar, jjt jjtVar, yrj yrjVar, agup agupVar, ague agueVar, azqb azqbVar, axwu axwuVar) {
        this.a = context;
        this.b = executor;
        this.c = aimrVar;
        this.i = jjtVar;
        this.d = yrjVar;
        this.e = agupVar;
        this.f = agueVar;
        this.g = azqbVar;
        this.h = axwuVar;
    }

    private static final PlaybackStartDescriptor c(PlaybackStartDescriptor playbackStartDescriptor, agqo agqoVar, int i) {
        apzg c = aguy.c(!TextUtils.isEmpty(playbackStartDescriptor.k()) ? playbackStartDescriptor.k() : "PPSV", agqoVar, i, playbackStartDescriptor.i(), playbackStartDescriptor.y());
        aijl d = PlaybackStartDescriptor.d();
        d.a = c;
        return d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r25, defpackage.yiw r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agug.a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, yiw, boolean):void");
    }

    @Override // defpackage.aguk
    public final ankt b(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z) {
        final yix c = yix.c();
        this.b.execute(new Runnable() { // from class: aguf
            @Override // java.lang.Runnable
            public final void run() {
                agug.this.a(playbackStartDescriptor, c, z);
            }
        });
        return c;
    }
}
