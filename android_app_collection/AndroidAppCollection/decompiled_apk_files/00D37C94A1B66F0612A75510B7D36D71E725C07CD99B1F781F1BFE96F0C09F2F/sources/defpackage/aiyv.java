package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
/* JADX WARN: Init of enum h can be incorrect */
/* compiled from: PG */
/* renamed from: aiyv  reason: default package */
/* loaded from: classes.dex */
public enum aiyv {
    MONOSPACED_SERIF(0, c("fonts/MonoSerif-Regular.ttf")),
    PROPORTIONAL_SERIF(1, b(Typeface.create("serif", 0))),
    MONOSPACED_SANS_SERIF(2, b(Typeface.create("monospace", 0))),
    PROPORTIONAL_SANS_SERIF(3, b(Typeface.create("sans-serif", 0))),
    CASUAL(4, c("fonts/ComingSoon-Regular.ttf")),
    CURSIVE(5, c("fonts/DancingScript-Regular.ttf")),
    SMALL_CAPITALS(6, c("fonts/CarroisGothicSC-Regular.ttf")),
    INLINE_MUTED(8, new aiyu() { // from class: aiys
        @Override // defpackage.aiyu
        public final Typeface a(Context context) {
            return ajgo.this.c(context);
        }
    });
    
    public final int i;
    private final aiyu k;
    private Typeface l;

    static {
        ajgo.ROBOTO_MEDIUM.getClass();
    }

    aiyv(int i, aiyu aiyuVar) {
        this.i = i;
        this.k = aiyuVar;
    }

    private static aiyu b(final Typeface typeface) {
        return new aiyu() { // from class: aiyr
            @Override // defpackage.aiyu
            public final Typeface a(Context context) {
                Typeface typeface2 = typeface;
                aiyv aiyvVar = aiyv.MONOSPACED_SERIF;
                return typeface2;
            }
        };
    }

    private static aiyu c(final String str) {
        return new aiyu() { // from class: aiyt
            @Override // defpackage.aiyu
            public final Typeface a(Context context) {
                String str2 = str;
                aiyv aiyvVar = aiyv.MONOSPACED_SERIF;
                return Typeface.createFromAsset(context.getAssets(), str2);
            }
        };
    }

    public static Typeface a(Context context, SubtitlesStyle subtitlesStyle) {
        int i = subtitlesStyle.f;
        if (i == 7) {
            return ((CaptioningManager) context.getSystemService("captioning")).getUserStyle().getTypeface();
        }
        aiyv[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            aiyv aiyvVar = values[i2];
            if (aiyvVar.i == i) {
                if (aiyvVar.l == null) {
                    aiyvVar.l = aiyvVar.k.a(context);
                }
                return values[i2].l;
            }
        }
        return null;
    }
}
