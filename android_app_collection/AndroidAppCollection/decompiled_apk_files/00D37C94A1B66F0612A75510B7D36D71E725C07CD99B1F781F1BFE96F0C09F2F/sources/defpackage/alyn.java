package defpackage;

import android.os.Parcel;
import com.google.android.youtube.api.StandalonePlayerActivity;
/* compiled from: PG */
/* renamed from: alyn  reason: default package */
/* loaded from: classes.dex */
public final class alyn extends dvd implements alyo {
    final /* synthetic */ StandalonePlayerActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alyn(StandalonePlayerActivity standalonePlayerActivity) {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
        this.a = standalonePlayerActivity;
    }

    @Override // defpackage.alyo
    public final void a() {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return false;
            }
            f();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.alyo
    public final void f() {
        this.a.finish();
    }

    @Override // defpackage.alyo
    public final void g() {
    }

    public alyn() {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
    }
}
