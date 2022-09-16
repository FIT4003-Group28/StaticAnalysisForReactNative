package defpackage;
/* compiled from: PG */
/* renamed from: acxi  reason: default package */
/* loaded from: classes.dex */
public final class acxi {
    private final acrr a;

    static {
        zep.a("MDX.BackgroundPlaybackLogger");
    }

    public acxi(acrr acrrVar) {
        this.a = acrrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, boolean z, String str) {
        Object[] objArr = new Object[4];
        int i3 = i - 1;
        objArr[0] = Integer.valueOf(i3);
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        objArr[1] = Integer.valueOf(i4);
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = str;
        String.format("playbackResult:%d sessionType:%d retry:%s playlistId:%s", objArr);
        aopa createBuilder = atbg.a.createBuilder();
        createBuilder.copyOnWrite();
        atbg atbgVar = (atbg) createBuilder.instance;
        atbgVar.c = i3;
        atbgVar.b |= 1;
        createBuilder.copyOnWrite();
        atbg atbgVar2 = (atbg) createBuilder.instance;
        atbgVar2.d = i4;
        atbgVar2.b |= 2;
        createBuilder.copyOnWrite();
        atbg atbgVar3 = (atbg) createBuilder.instance;
        atbgVar3.b |= 8;
        atbgVar3.e = z;
        createBuilder.copyOnWrite();
        atbg atbgVar4 = (atbg) createBuilder.instance;
        str.getClass();
        atbgVar4.b |= 16;
        atbgVar4.f = str;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cS((atbg) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
    }
}
