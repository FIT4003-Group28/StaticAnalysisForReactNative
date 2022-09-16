package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: svn  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class svn implements svz {
    private final /* synthetic */ int l;
    public static final /* synthetic */ svn k = new svn(10);
    public static final /* synthetic */ svn j = new svn(9);
    public static final /* synthetic */ svn i = new svn(8);
    public static final /* synthetic */ svn h = new svn(7);
    public static final /* synthetic */ svn g = new svn(6);
    public static final /* synthetic */ svn f = new svn(5);
    public static final /* synthetic */ svn e = new svn(4);
    public static final /* synthetic */ svn d = new svn(3);
    public static final /* synthetic */ svn c = new svn(2);
    public static final /* synthetic */ svn b = new svn(1);
    public static final /* synthetic */ svn a = new svn();

    private /* synthetic */ svn() {
    }

    private /* synthetic */ svn(int i2) {
        this.l = i2;
    }

    @Override // defpackage.svz
    public final aodt a(ByteBuffer byteBuffer) {
        switch (this.l) {
            case 0:
                axmq axmqVar = new axmq();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmqVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmqVar;
            case 1:
                axmm axmmVar = new axmm();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmmVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmmVar;
            case 2:
                axmr axmrVar = new axmr();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmrVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmrVar;
            case 3:
                axmv axmvVar = new axmv();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmvVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmvVar;
            case 4:
                axmw axmwVar = new axmw();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmwVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmwVar;
            case 5:
                axmy axmyVar = new axmy();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmyVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmyVar;
            case 6:
                axmz axmzVar = new axmz();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axmzVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axmzVar;
            case 7:
                axnh axnhVar = new axnh();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                axnhVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return axnhVar;
            case 8:
                return axnk.aK(byteBuffer);
            case 9:
                return axnc.aH(byteBuffer);
            default:
                return axnc.aH(byteBuffer);
        }
    }
}
