package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.RenameRequest;
/* compiled from: PG */
/* renamed from: cotk  reason: default package */
/* loaded from: classes5.dex */
public final class cotk extends cla implements IInterface {
    public cotk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
    }

    public final void e(cotj cotjVar, OpenFileDescriptorRequest openFileDescriptorRequest) {
        Parcel a = a();
        clc.f(a, cotjVar);
        clc.e(a, openFileDescriptorRequest);
        Sk(1, a);
    }

    public final void f(cotj cotjVar, DeleteFileRequest deleteFileRequest) {
        Parcel a = a();
        clc.f(a, cotjVar);
        clc.e(a, deleteFileRequest);
        Sk(2, a);
    }

    public final void g(cotj cotjVar, RenameRequest renameRequest) {
        Parcel a = a();
        clc.f(a, cotjVar);
        clc.e(a, renameRequest);
        Sk(3, a);
    }
}
