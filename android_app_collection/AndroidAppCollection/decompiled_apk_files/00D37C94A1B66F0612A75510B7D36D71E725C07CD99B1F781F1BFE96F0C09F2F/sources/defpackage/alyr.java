package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.h;
/* compiled from: PG */
/* renamed from: alyr  reason: default package */
/* loaded from: classes.dex */
public final class alyr extends dvd implements alys {
    public final g a;
    public final e b;
    private final Handler c;

    public alyr(Handler handler, abdo abdoVar, ajmy ajmyVar, yrj yrjVar, alyq alyqVar) {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
        alyqVar.getClass();
        handler.getClass();
        this.c = handler;
        g gVar = new g(alyqVar);
        this.a = gVar;
        this.b = new e(gVar, abdoVar, ajmyVar, yrjVar);
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                final String readString = parcel.readString();
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        alyr alyrVar = alyr.this;
                        String str = readString;
                        e eVar = alyrVar.b;
                        eVar.b();
                        if (TextUtils.isEmpty(str)) {
                            eVar.f(3);
                            return;
                        }
                        eVar.d = new d(eVar, str);
                        eVar.d.h();
                    }
                });
                break;
            case 2:
                final String readString2 = parcel.readString();
                final int readInt = parcel.readInt();
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        alyr alyrVar = alyr.this;
                        String str = readString2;
                        int i3 = readInt;
                        e eVar = alyrVar.b;
                        eVar.b();
                        if (TextUtils.isEmpty(str)) {
                            eVar.f(3);
                            return;
                        }
                        eVar.d = new b(eVar, str, i3);
                        eVar.d.h();
                    }
                });
                break;
            case 3:
                Handler handler = this.c;
                e eVar = this.b;
                eVar.getClass();
                handler.post(new h(eVar));
                break;
            case 4:
                Handler handler2 = this.c;
                e eVar2 = this.b;
                eVar2.getClass();
                handler2.post(new h(eVar2, 2));
                break;
            case 5:
                Handler handler3 = this.c;
                e eVar3 = this.b;
                eVar3.getClass();
                handler3.post(new h(eVar3, 1));
                break;
            case 6:
                this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        alyr.this.a.a = null;
                        System.gc();
                    }
                });
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public alyr() {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
    }
}
