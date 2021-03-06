// automatically generated by the FlatBuffers compiler, do not modify

package vn.com.vng.gsmobile.casino.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class CMDStartGame extends Table {
  public static CMDStartGame getRootAsCMDStartGame(ByteBuffer _bb) { return getRootAsCMDStartGame(_bb, new CMDStartGame()); }
  public static CMDStartGame getRootAsCMDStartGame(ByteBuffer _bb, CMDStartGame obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public CMDStartGame __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long roomId() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public boolean mutateRoomId(long room_id) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, room_id); return true; } else { return false; } }

  public static int createCMDStartGame(FlatBufferBuilder builder,
      long room_id) {
    builder.startObject(1);
    CMDStartGame.addRoomId(builder, room_id);
    return CMDStartGame.endCMDStartGame(builder);
  }

  public static void startCMDStartGame(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addRoomId(FlatBufferBuilder builder, long roomId) { builder.addLong(0, roomId, 0); }
  public static int endCMDStartGame(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

