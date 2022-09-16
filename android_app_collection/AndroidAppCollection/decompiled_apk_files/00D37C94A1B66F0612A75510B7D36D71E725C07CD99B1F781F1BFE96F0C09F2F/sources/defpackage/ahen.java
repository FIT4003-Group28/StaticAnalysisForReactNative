package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahen  reason: default package */
/* loaded from: classes.dex */
public final class ahen {
    public final Context a;
    public final aijf b;
    public final aant c;
    public final AudioManager d;
    public final ahel e;
    public final bame f;
    public final ahek g;
    public ahem h;
    public PlaybackAudioManager$RestorableState i;
    public int j;
    public PlayerResponseModel k;
    public int l = 2;
    private final Executor m;

    public ahen(Context context, aijf aijfVar, aant aantVar, Executor executor, bame bameVar) {
        context.getClass();
        this.a = context;
        aijfVar.getClass();
        this.b = aijfVar;
        aantVar.getClass();
        this.c = aantVar;
        executor.getClass();
        this.m = executor;
        this.f = bameVar;
        this.j = 0;
        this.i = new PlaybackAudioManager$RestorableState();
        this.d = (AudioManager) context.getSystemService("audio");
        this.e = new ahel(this);
        ahek ahekVar = new ahek(this);
        this.g = ahekVar;
        ahekVar.a();
    }

    public final void a() {
        if (this.i.a) {
            this.m.execute(new Runnable() { // from class: ahej
                @Override // java.lang.Runnable
                public final void run() {
                    ahen ahenVar = ahen.this;
                    if (ahenVar.b.m) {
                        return;
                    }
                    aijb.a(aija.AUDIOMANAGER, "AudioFocus Requested", new Object[0]);
                    if (ahenVar.d.requestAudioFocus(ahenVar.e, 3, 1) == 1) {
                        aijb.a(aija.AUDIOMANAGER, "AudioFocus Granted", new Object[0]);
                        ahel ahelVar = ahenVar.e;
                        int i = ahel.e;
                        ahelVar.c.j = 1;
                        ahelVar.a = false;
                        return;
                    }
                    aijb.a(aija.AUDIOMANAGER, "AudioFocus DENIED", new Object[0]);
                }
            });
        }
    }
}
