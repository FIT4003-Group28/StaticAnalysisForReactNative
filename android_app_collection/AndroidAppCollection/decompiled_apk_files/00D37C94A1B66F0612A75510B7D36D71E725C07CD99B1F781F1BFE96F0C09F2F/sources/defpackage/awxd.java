package defpackage;

import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: awxd  reason: default package */
/* loaded from: classes2.dex */
final class awxd implements ProcessorBase.FrameCallback {
    final /* synthetic */ ProcessorBase a;

    public awxd(ProcessorBase processorBase) {
        this.a = processorBase;
    }

    @Override // com.google.research.xeno.effect.ProcessorBase.FrameCallback
    public final void process(Packet packet) {
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((aoic) it.next()).a(PacketGetter.a(packet));
        }
    }
}
