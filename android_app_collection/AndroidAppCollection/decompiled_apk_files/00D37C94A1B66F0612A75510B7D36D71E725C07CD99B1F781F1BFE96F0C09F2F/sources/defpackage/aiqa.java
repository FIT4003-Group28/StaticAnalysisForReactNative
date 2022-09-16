package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: aiqa  reason: default package */
/* loaded from: classes.dex */
public final class aiqa {
    public static aiky a(final aiku aikuVar) {
        return new aiky() { // from class: aipy
            @Override // defpackage.aiky
            public final aikx a(PlaybackStartDescriptor playbackStartDescriptor) {
                return aiku.this;
            }
        };
    }

    public static aipz b(ampt amptVar, aipq aipqVar) {
        return new aipz(aipqVar, amptVar);
    }

    public static boolean c(PlayerResponseModel playerResponseModel) {
        return playerResponseModel != null && playerResponseModel.t() != null && aijr.g(playerResponseModel.t()) && (!playerResponseModel.F() || playerResponseModel.c().aU());
    }

    public static boolean d(int i) {
        return e(i, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14);
    }

    public static boolean e(int i, int... iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
