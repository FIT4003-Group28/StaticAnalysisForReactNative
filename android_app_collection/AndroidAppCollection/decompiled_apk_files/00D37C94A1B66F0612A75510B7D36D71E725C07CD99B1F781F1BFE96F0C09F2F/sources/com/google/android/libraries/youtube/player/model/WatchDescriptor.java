package com.google.android.libraries.youtube.player.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.text.ParseException;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class WatchDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(1);
    public final PlaybackStartDescriptor a;
    public final aopa b;

    public WatchDescriptor(aopa aopaVar) {
        aopaVar.getClass();
        aijl d = PlaybackStartDescriptor.d();
        ory oryVar = ((osb) aopaVar.instance).c;
        d.m = oryVar == null ? ory.a : oryVar;
        this.a = d.a();
        this.b = aopaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[Catch: ParseException -> 0x011a, TRY_LEAVE, TryCatch #0 {ParseException -> 0x011a, blocks: (B:5:0x000f, B:27:0x0085, B:29:0x008d, B:31:0x00a4, B:33:0x00b8, B:34:0x00c7, B:36:0x010f, B:38:0x0116, B:35:0x00fd, B:8:0x001c, B:10:0x0024, B:11:0x0028, B:13:0x0030, B:15:0x0036, B:17:0x0042, B:18:0x0048, B:20:0x0054, B:21:0x005a, B:23:0x0072, B:25:0x007d), top: B:41:0x000f }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.libraries.youtube.player.model.WatchDescriptor a(android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.player.model.WatchDescriptor.a(android.content.Intent):com.google.android.libraries.youtube.player.model.WatchDescriptor");
    }

    @Deprecated
    public static final WatchDescriptor b(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            String[] stringArray = extras.getStringArray("android.intent.extra.inventory_identifier");
            if (stringArray != null && stringArray.length == 1) {
                afzp a = afzp.a(Uri.parse(stringArray[0]));
                aijl d = PlaybackStartDescriptor.d();
                d.c(a.a);
                d.k = a.b;
                return new WatchDescriptor(d.a());
            }
        } catch (ParseException unused) {
        }
        return null;
    }

    public final void c(Bundle bundle) {
        boolean z = bundle.getBoolean("finish_on_ended", false);
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        osbVar.b |= 2;
        osbVar.d = z;
        d(bundle.getBoolean("force_fullscreen", false));
        h();
        f(bundle.getBoolean("skip_remote_route_dialog", false));
        boolean z2 = bundle.getBoolean("is_loopback", false);
        e(z2);
        aopa aopaVar2 = this.b;
        aopaVar2.copyOnWrite();
        osb osbVar3 = (osb) aopaVar2.instance;
        osbVar3.b |= 64;
        osbVar3.i = !z2;
    }

    public final void d(boolean z) {
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        osbVar.b |= 4;
        osbVar.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(boolean z) {
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        osbVar.b |= 32;
        osbVar.h = z;
    }

    public final void f(boolean z) {
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        osbVar.b |= 16;
        osbVar.g = z;
    }

    public final boolean g() {
        return ((osb) this.b.instance).i;
    }

    public final void h() {
        aopa aopaVar = this.b;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        osbVar.b |= 8;
        osbVar.f = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aopa aopaVar = this.b;
        ory oryVar = this.a.a;
        aopaVar.copyOnWrite();
        osb osbVar = (osb) aopaVar.instance;
        osb osbVar2 = osb.a;
        oryVar.getClass();
        osbVar.c = oryVar;
        osbVar.b |= 1;
        parcel.writeByteArray(((osb) this.b.mo39build()).toByteArray());
    }

    public WatchDescriptor(PlaybackStartDescriptor playbackStartDescriptor) {
        this.b = osb.a.createBuilder();
        playbackStartDescriptor.getClass();
        this.a = playbackStartDescriptor;
    }
}
