package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.a;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.b;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DisconnectedApiPlayerService extends IApiPlayerService.Stub {
    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void A(EmbedsPrewarmData embedsPrewarmData) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void B(boolean z) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void D(CommandWrapper commandWrapper) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void E(int i) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void F(int i) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void G(boolean z) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void H(boolean z) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void I(boolean z) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void J() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void K(String str) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void L() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void M() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void N() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean O() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final boolean P(byte[] bArr) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return false;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] Q() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new byte[0];
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final byte[] R() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new byte[0];
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final d a() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new a();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final c b() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new b() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService.2
            @Override // com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c
            public final void a(RemoteEmbedExceptionData remoteEmbedExceptionData) {
            }
        };
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d d() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.a();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c e() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
        return new com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.b() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService.1
            @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c
            public final void a(SelectableItemKey selectableItemKey) {
            }
        };
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void f() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void g() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void h(String str, int i, int i2, int i3) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void i(String str, int i, int i2) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void j(List list, int i, int i2, int i3) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void k(boolean z) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void l(String str) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void m() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void n() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void o(String str, int i, int i2, boolean z, int i3) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void p(String str, boolean z, int i, boolean z2, int i2) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void q(List list, int i, int i2, boolean z, int i3) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void r() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void s(VisibilityChangeEventData visibilityChangeEventData) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void t(byte[] bArr) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void u(int i, KeyEvent keyEvent) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void v(int i, KeyEvent keyEvent) {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void w() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void x() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void y() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService
    public final void z() {
        aqvb.l("PlayerService was disconnected", new Object[0]);
    }
}
